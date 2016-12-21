package com.kingtec2169.survivalguide;

// Created by Ryan Zoeller/Matthew Zwinger of FIRST FRC team 2169.
// This class is an adapter used to bind fragments holding content to the
// ViewPager. If the device is a 10" tablet two pages of content are to be shown,
// so the PageFragmentContainer replaces the singular PageFragment.

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    Context context = null;
    final ContentIdHolder contentId;
    final boolean combineContent;

    public PagerAdapter(Context context, FragmentManager mgr, int group, int child, boolean combineContent) {
        super(mgr);
        this.contentId = new ContentIdHolder(group, child, 0);
        this.context = context;
        this.combineContent = combineContent;
    }

    @Override
    public int getCount() {
        // Return the number of pages bound to a specific id
        // The number of pages are stored in an array and we can
        // retrieve them by their id
        if (combineContent) {
            // Add one so that if we have an unpaired page it doesn't get hidden
            return (PageContent.numPages[contentId.getGroupPosition()][contentId.getChildPosition()] + 1)/ 2;
        } else {
            return PageContent.numPages[contentId.getGroupPosition()][contentId.getChildPosition()];
        }
    }

    @Override
    public Fragment getItem(int pageNumber) {
        // Returns a PageFragment holding the content based off of its id and pageNumber
        PageFragmentContainer container = new PageFragmentContainer();
        if(combineContent) {
            // Set the left page of content
            // This page is guaranteed to exist by the ViewPager
            container.setLeft(PageFragment.newInstance(ContentIdHolder.newInstance(contentId).setPage(pageNumber * 2)));

            // Don't show non-existent content
            // The right page may not exist if the left pane is the last entry
            if((pageNumber * 2 + 1) < PageContent.numPages[contentId.getGroupPosition()][contentId.getChildPosition()]) {
                container.setRight(PageFragment.newInstance(ContentIdHolder.newInstance(contentId).setPage(pageNumber * 2 + 1)));
            }
            return(container);
        } else {
            // We only are showing one page of content because this is a small device
            return PageFragment.newInstance(ContentIdHolder.newInstance(ContentIdHolder.newInstance(contentId).setPage(pageNumber)));
        }
    }

    @Override
    public String getPageTitle(int pageNumber) {
        // Returns a title from the content it is displaying
        // Only show two titles if we are combining content
        if(combineContent) {
            // Check if we are showing the last page
            if(pageNumber * 2 + 1 < PageContent.numPages[contentId.getGroupPosition()][contentId.getChildPosition()]) {
                return PageFragment.getTitle(context, ContentIdHolder.newInstance(contentId).setPage(pageNumber * 2)) + " | "
                        + PageFragment.getTitle(context, ContentIdHolder.newInstance(contentId).setPage(pageNumber * 2 + 1));
            } else {
                return PageFragment.getTitle(context, ContentIdHolder.newInstance(contentId).setPage(pageNumber * 2));
            }
        } else {
            // We are not on a large tablet, so titles are not combined
            return PageFragment.getTitle(context, ContentIdHolder.newInstance(contentId).setPage(pageNumber));
        }
    }
}