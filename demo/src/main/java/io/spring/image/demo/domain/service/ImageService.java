package io.spring.image.demo.domain.service;

import io.spring.image.demo.domain.entity.Image;
import org.springframework.transaction.annotation.Transactional;

public interface ImageService {
    @Transactional
    Image save(Image image);
}
