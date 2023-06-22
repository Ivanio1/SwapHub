package com.ivanio.swaphub.repositories;

import com.ivanio.swaphub.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,Long> {

}
