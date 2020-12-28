package com.example.demo;

import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Data @ToString
public class SurfConditions {

    private static final Logger LOG = Logger.getLogger("SurfConditions");

    private final String location;
    private final int chanceOfRainPercent;
    private final double windKnots;
    private final String windDirection;
    private final int swellHeight;
    private final int swellPeriodSeconds;

    static SurfConditions getRandom(String location) {

        List<String> windDirections = Arrays.asList("S", "SW", "W", "NW", "N", "NE", "E", "SE");
        Random rand = new Random();
        String windDirection = windDirections.get(rand.nextInt(windDirections.size()));
        int chanceOfRain = (int)(Math.random() * 100);
        double windKnots = (Math.random() * (40 - 5)) + 5;
        int swellHeight = (int)((Math.random() * (25 - 2)) + 2);
        int swellPeriodSeconds = (int)((Math.random() * (15 - 8)) + 8);

        SurfConditions report = new SurfConditions(
                location,  // just the input location
                chanceOfRain,  // random int between 0-100
                windKnots,  // random double between 5-40
                windDirection,  // random direction
                swellHeight,  // random int between 2-14
                swellPeriodSeconds // random int between 8-15
        );

        LOG.info(report.toString());

        return report;
    }

}
