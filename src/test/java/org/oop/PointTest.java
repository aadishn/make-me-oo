package org.oop;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        int originX = 0;
        int originY = 0;
        Point origin = new Point(originX, originY);
        int expectedDistance = 0;

        double actualDistance = origin.distance(origin);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        int originX = 0;
        int originY = 0;
        Point origin = new Point(originX, originY);
        int point1X = 1;
        int point1Y = 0;
        Point point1 = new Point(point1X, point1Y);
        int point2X = 0;
        int point2Y = 1;
        Point point2 = new Point(point2X, point2Y);
        int expectedDistance1 = 1;
        int expectedDistance2 = 1;

        double actualDistance1 = origin.distance(point1);
        double actualDistance2 = origin.distance(point2);

        assertEquals(expectedDistance1, actualDistance1);
        assertEquals(expectedDistance2, actualDistance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        int point1X = 1;
        int point1Y = 0;
        Point point1 = new Point(point1X, point1Y);
        int point2X = -1;
        int point2Y = 0;
        Point point2 = new Point(point2X, point2Y);
        int expectedDistance = 2;

        double actualDistance = point1.distance(point2);

        assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        int point1X = 1;
        int point1Y = 0;
        Point point1 = new Point(point1X, point1Y);
        int point2X = 3;
        int point2Y = 0;
        Point point2 = new Point(point2X, point2Y);
        int expectedDirection1 = 0;
        int expectedDirection2 = 0;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expectedDirection1, actualDirection1);
        assertEquals(expectedDirection2, actualDirection2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        int originX = 0;
        int originY = 0;
        Point origin = new Point(originX, originY);
        int point1X = -1;
        int point1Y = 0;
        Point point1 = new Point(point1X, point1Y);
        int point2X = -3;
        int point2Y = 0;
        Point point2 = new Point(point2X, point2Y);
        double expected = Math.PI;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expected, actualDirection1);
        assertEquals(expected, actualDirection2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        int originX = 0;
        int originY = 0;
        Point origin = new Point(originX, originY);
        int point1X = 0;
        int point1Y = 1;
        Point point1 = new Point(point1X, point1Y);
        int point2X = 0;
        int point2Y = 3;
        Point point2 = new Point(point2X, point2Y);
        double expected = Math.PI / 2;

        double actualDirection1 = origin.direction(point1);
        double actualDirection2 = origin.direction(point2);

        assertEquals(expected, actualDirection2);
        assertEquals(expected, actualDirection1);
    }
}
