package com.exchangediary.diary.domain.entity;

import com.exchangediary.global.domain.entity.BaseEntity;
import com.exchangediary.global.domain.entity.StaticImage;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor(access = PRIVATE)
public class Diary extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String writer;
    private String profileImage;
    private String content;
    @Enumerated(EnumType.STRING)
    private PublicationStatus status;
    private int index;
    @OneToOne
    private UploadImage uploadImage;
    @ManyToOne
    private StaticImage staticImage;
}
