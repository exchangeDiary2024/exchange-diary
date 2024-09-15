package com.exchangediary.diary.domain;

import com.exchangediary.diary.domain.entity.Sticker;
import org.springframework.data.repository.CrudRepository;

public interface StickerRepository extends CrudRepository<Sticker, Long> {
    int countByDiaryId(long diaryId);
}
