package com.contest.onlinegameservice.service;

import com.contest.onlinegameservice.dto.Clan;
import com.contest.onlinegameservice.dto.GroupRecord;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @PostMapping("/onlinegame/calculate")
    public ResponseEntity<List<List<Clan>>> getGroupsForEvent(@RequestBody GroupRecord groupRecord) {
        return ResponseEntity.ok(GameService.createGroupsForEvent(groupRecord));
    }
}
