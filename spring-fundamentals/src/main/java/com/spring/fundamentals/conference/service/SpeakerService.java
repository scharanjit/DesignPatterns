package com.spring.fundamentals.conference.service;

import com.spring.fundamentals.conference.models.Speaker;
import java.util.List;

public interface SpeakerService {

  List<Speaker> findAll();
}
