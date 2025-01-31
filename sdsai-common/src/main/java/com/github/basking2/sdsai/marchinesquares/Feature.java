package com.github.basking2.sdsai.marchinesquares;

import java.util.HashMap;
import java.util.Map;

/**
 * A feature is a map of strings to strings and an orderd list of points.
 *
 * The list of points is directed, with the first point being the start
 * and the last point being the end. If the feature is a polygon, then
 * the first and last point are the same values.
 */
public class Feature {

    /**
     * Properties.
     */
    public final Map<String, Object> properties;

    /**
     * A list of all points that make up this feature.
     * If the first and last point values are the same values,
     * then the feature is a polygon.
     */
    public final LinkedList.Node<Point> points;

    public Feature(final LinkedList.Node<Point> points) {
        this.points = points;
        this.properties = new HashMap<>();
    }

    /**
     * Add the given x and y offset to this point, translating it.
     *
     * @param xOffset The distance to move x.
     * @param yOffset The distance to move y.
     */
    public void translate(final double xOffset, final double yOffset) {
        for (final Point point: points) {
            point.x += xOffset;
            point.y += yOffset;
        }
    }
}
