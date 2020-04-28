package com.spring.fundamentals.conference.repository;

import com.spring.fundamentals.conference.models.Speaker;
import java.util.List;

public interface SpeakerRepository {

  List<Speaker> findAll();
}
