package io.spring.image.demo.application;

import lombok.RequiredArgsConstructor;
import io.spring.image.demo.domain.entity.Image;
import io.spring.image.demo.domain.service.ImageService;
import io.spring.image.demo.infra.repository.ImageRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class imageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {

        return repository.save(image);

    }
}