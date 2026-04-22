package io.spring.image.demo.application;

import lombok.RequiredArgsConstructor;
import io.spring.image.demo.domain.entity.Image;
import io.spring.image.demo.domain.service.imageService;
import io.spring.image.demo.infra.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class imageServiceImpl implements imageService {

    private final ImageRepository repository;
    @Transactional
    public Image save(Image image) {return null;};

    
}
