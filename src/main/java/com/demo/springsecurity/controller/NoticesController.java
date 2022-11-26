package com.demo.springsecurity.controller;

import com.demo.springsecurity.model.Notice;
import com.demo.springsecurity.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequiredArgsConstructor
@CrossOrigin(
        allowedHeaders = {"*"},
        origins = {"*"})
public class NoticesController {
    private final NoticeRepository noticeRepository;

    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices() {
        List<Notice> notices = (List<Notice>) noticeRepository.findAll();

        if (notices.isEmpty()) {
            return null;
        }
        return ResponseEntity.ok()
                .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                .body(notices);
    }
}
