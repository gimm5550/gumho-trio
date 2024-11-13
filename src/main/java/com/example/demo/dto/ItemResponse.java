// src/main/java/com/example/demo/dto/ItemResponse.java
package com.example.demo.dto;

public class ItemResponse {
    private Long id;
    private String title;
    private String content;
    private Long adminId;
    private Integer memberCount;
    private String region;

    public ItemResponse(Long id, String title, String content, Long adminId, Integer memberCount, String region) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.adminId = adminId;
        this.memberCount = memberCount;
        this.region = region;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
