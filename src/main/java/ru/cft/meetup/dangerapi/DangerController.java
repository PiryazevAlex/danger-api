package ru.cft.meetup.dangerapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DangerController {
  private static final String[] DANGERS = {"Падает астероид", "Космические захватчики", "Ядерный взрыв", "Наводнение"};

  @GetMapping("danger")
  public String currentDanger() {
    return DANGERS[new Random().nextInt(DANGERS.length)];
  }

  @GetMapping("isDangerous")
  public Boolean isDangerous(){
    return new Random().nextBoolean();
  }
}
