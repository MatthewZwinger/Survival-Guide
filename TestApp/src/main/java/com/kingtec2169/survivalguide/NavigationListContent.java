package com.kingtec2169.survivalguide;

// Created by Ryan Zoeller/Matthew Zwinger of FIRST FRC team 2169.
// This class acts as a holder for the list items in the ExpandableListNavigationFragment.

import java.util.ArrayList;
import java.util.List;

public class NavigationListContent {
    // The children of the ExpandableListView, holds the contents of each group
    public static final List<List<NavigationListItem>> CHILDREN = new ArrayList<List<NavigationListItem>>();
    // The parents of the ExpandableListView, holds the head item of each group
    public static final List<NavigationListItem> PARENTS = new ArrayList<NavigationListItem>();

    static {
        // Populate the list of parents
        NavigationListItem[] parents = {new NavigationListItem("0", "Departments", ""), new NavigationListItem("1", "Build Season", ""), new NavigationListItem("2", "Competitions", ""), new NavigationListItem("3", "Team Content", "")};
        // Add children to the first parent
        addItem(parents[0], new NavigationListItem("0", "Mechanical", ""));
        addItem(parents[0], new NavigationListItem("1", "Programming", ""));
        addItem(parents[0], new NavigationListItem("2", "Electrical", ""));
        addItem(parents[0], new NavigationListItem("3", "Chairmans", ""));
        addItem(parents[0], new NavigationListItem("4", "CAD", ""));
        addItem(parents[0], new NavigationListItem("5", "Strategy", ""));
        addItem(parents[0], new NavigationListItem("6", "Media", ""));
        addItem(parents[0], new NavigationListItem("7", "Spirit", ""));
        addItem(parents[0], new NavigationListItem("8", "Public Relations", ""));
        // Add children to the second parent
        addItem(parents[1], new NavigationListItem("0", "Pre-Build Season", ""));
        addItem(parents[1], new NavigationListItem("1", "Week 1", ""));
        addItem(parents[1], new NavigationListItem("2", "Week 2", ""));
        addItem(parents[1], new NavigationListItem("3", "Week 3", ""));
        addItem(parents[1], new NavigationListItem("4", "Week 4", ""));
        addItem(parents[1], new NavigationListItem("5", "Week 5", ""));
        addItem(parents[1], new NavigationListItem("6", "Week 6", ""));
        // Add children to the third parent
        addItem(parents[2], new NavigationListItem("0", "Week 0 Competitions", ""));
        addItem(parents[2], new NavigationListItem("1", "Regionals", ""));
        // Add children to the fourth parent
        addItem(parents[3], new NavigationListItem("0", "Team Structure", ""));
        addItem(parents[3], new NavigationListItem("1", "Off Season", ""));

    }

    private static void addItem(NavigationListItem parent, NavigationListItem child) {

        if (!PARENTS.contains(parent)) { // Make sure we haven't added this parent already
            PARENTS.add(parent);
        }
 while (CHILDREN.size() <= 100) { //Integer.parseInt(parent.id)) {
      //  if (CHILDREN.get(Integer.parseInt(parent.id)).size() <1 ) { // If we haven't created an array for this data point
            CHILDREN.add(new ArrayList<NavigationListItem>()); // Add an empty array which we will populate in the future
        }
        CHILDREN.get(Integer.parseInt(parent.id)).add(child);

    }
}
