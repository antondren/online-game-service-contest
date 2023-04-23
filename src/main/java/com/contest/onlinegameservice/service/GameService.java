package com.contest.onlinegameservice.service;

import com.contest.onlinegameservice.dto.Clan;
import com.contest.onlinegameservice.dto.GroupRecord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class GameService {

    private GameService() {
    }

    /**
     * Creates groups of clans for the event based on the group count and clan list.
     *
     * @param groupRecord A GroupRecord object containing group count and list of clans.
     * @return A list of lists of Clan objects representing the groups for the event.
     */
    public static List<List<Clan>> createGroupsForEvent(GroupRecord groupRecord) {
        sortClans(groupRecord.clans());

        List<List<Clan>> result = new ArrayList<>();
        while (!groupRecord.clans().isEmpty()) {
            result.add(
                    createGroup(
                            groupRecord.groupCount(),
                            groupRecord.clans().iterator()
                    )
            );
        }
        return result;
    }

    /**
     * Creates a group of clans based on the group count and an iterator for the remaining clans.
     *
     * @param groupCount The maximum size of a group.
     * @param iterator   An iterator for the list of remaining clans.
     * @return A list of Clan objects representing a single group.
     */
    private static List<Clan> createGroup(int groupCount, Iterator<Clan> iterator) {
        List<Clan> group = new ArrayList<>();
        int groupSize = 0;

        while (iterator.hasNext()) {
            Clan currentClan = iterator.next();
            if (groupSize + currentClan.getNumberOfPlayers() <= groupCount) {
                group.add(currentClan);
                groupSize += currentClan.getNumberOfPlayers();
                iterator.remove();
            }
        }
        return group;
    }

    /**
     * Sorts the list of clans based on their points and number of players.
     *
     * @param clans A list of Clan objects to be sorted.
     */
    private static void sortClans(List<Clan> clans) {
        clans.sort(Comparator.comparing(Clan::getPoints)
                .reversed()
                .thenComparing(Clan::getNumberOfPlayers));
    }

}
