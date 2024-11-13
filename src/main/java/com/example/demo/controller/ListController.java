// src/main/java/com/example/demo/controller/ListController.java
package com.example.demo.controller;

import com.example.demo.dto.ItemResponse;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // 클라이언트 도메인 허용
public class ListController {
    @Autowired
    private ItemRepository itemRepository;

    // /api/list 엔드포인트에서 모든 Item 목록 가져오기
    @GetMapping("/list")
    public List<ItemResponse> getAllItems() {
        System.out.println("Fetching item list...");

        return itemRepository.findAll().stream()
                .map(item -> new ItemResponse(
                        item.getId(),
                        item.getTitle(),
                        item.getContent(),
                        item.getAdminId(),
                        item.getMemberCount(),
                        item.getRegion()))
                .collect(Collectors.toList());
    }
}
