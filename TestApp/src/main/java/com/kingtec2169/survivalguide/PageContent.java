package com.kingtec2169.survivalguide;

// Created by Ryan Zoeller/Matthew Zwinger of FIRST FRC team 2169.
// This class is responsible for loading and storing content from XML as it is requested.
// It loads content into memory in blocks, with all of the content shown in
// the ViewPager being loaded at once. When a new block of content is loaded, the old block
// is unloaded.

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class    PageContent {
    // Stores the items for the Pages
    public static final List<Page> PAGES = new ArrayList<Page>();
    // Number of pages in each week
    public static final int numPages[][] = {
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            {3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            {3, 3, 3, 3, 3}
    };
    // Which content is currently in memory
    private static int loaded_group;
    private static int loaded_child;
    // The context we should load our resources from
    private static Context mContext;

    public static void refresh(Context context) {
        if (PAGES.isEmpty()) { // If no content has been loaded set the loaded variable to reflect that
            loaded_group = -1;
            loaded_child = -1;
        }

        mContext = context; // Update our context for loading resources
    }

    public static Page get(int group, int child, int position) {
        if (loaded_group != group || loaded_child != child) {
            unload();
            load(group, child);
        }
        return PAGES.get(position);
    }

    public static Page get(ContentIdHolder contentId) {
        return PageContent.get(contentId.getGroupPosition(), contentId.getChildPosition(), contentId.getPage());
    }

    private static void load(int group, int child) {
        loaded_group = group;
        loaded_child = child;
        if (MainActivity.getLanguage() == false) {
            switch (group) {
                case 0:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
                case 1:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
                case 2:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
                case 3:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
            }
        } else {
            switch (group) {
                case 0:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;

                    }
                    break;
                case 1:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
                case 2:
                    switch (child) {
                        case 0:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 1:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 2:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 3:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 4:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 5:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 6:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 7:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 8:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                        case 9:
                            PAGES.add(new Page(mContext, R.array.contentname1));
                            PAGES.add(new Page(mContext, R.array.contentname2));
                            PAGES.add(new Page(mContext, R.array.contentname3));
                            break;
                    }
                    break;
            }
        }
    }



    private static void unload () {
        loaded_group = -1;
        loaded_child = -1;
        // Clear array to be refilled with new data
        PAGES.clear();
    }
}
