import stl.algav567.support.algorithms.Algorithms;
import stl.algav567.support.gui.Circle;
import stl.algav567.support.gui.Line;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/***************************************************************
 *
 * class Circle:                                               *
 *   - Circle(Point c, int r) constructs a new circle          *
 *     centered at c with radius r.                            *
 *   - Point getCenter() returns the center point.             *
 *   - int getRadius() returns the circle radius.              *
 *                                                             *
 * class Line:                                                 *
 *   - Line(Point p, Point q) constructs a new line            *
 *     starting at p ending at q.                              *
 *   - Point getP() returns one of the two end points.         *
 *   - Point getQ() returns the other end point.               *
 ***************************************************************/


public class DefaultTeam implements Algorithms {

  // calculDiametre: ArrayList<Point> --> Line
  //   renvoie une pair de points de la liste, de distance maximum.
  public Line calculDiametre(List<Point> points) {
    if (points.size()<3) {
      return null;
    }

    Point p=points.get(0);
    Point q=points.get(1);

    /*******************
     * PARTIE A ECRIRE *
     *******************/
    return new Line(p,q);
  }

  // calculDiametreOptimise: ArrayList<Point> --> Line
  //   renvoie une pair de points de la liste, de distance maximum.

  public Line calculDiametreOptimise(List<Point> points) {
    if (points.size()<3) {
      return null;
    }

    Point p=points.get(1);
    Point q=points.get(2);

    /*******************
     * PARTIE A ECRIRE *
     *******************/
    return new Line(p,q);
  }

  // calculCercleMin: ArrayList<Point> --> Circle
  //   renvoie un cercle couvrant tout point de la liste, de rayon minimum.
  public Circle calculCercleMin(List<Point> points) {
    if (points.isEmpty()) {
      return null;
    }

    Point center=points.get(0);
    int radius=100;

    /*******************
     * PARTIE A ECRIRE *
     *******************/
    return new Circle(center,radius);
  }

  // enveloppeConvexe: ArrayList<Point> --> ArrayList<Point>
  //   renvoie l'enveloppe convexe de la liste.
  public List<Point> enveloppeConvexe(List<Point> points){
    if (points.size()<3) {
      return null;
    }

    ArrayList<Point> enveloppe = new ArrayList<>();

    enveloppe.add(points.get(0));
    enveloppe.add(points.get(1));
    enveloppe.add(points.get(2));


    /*******************
     * PARTIE A ECRIRE *
     *******************/
    return points;
  }

}
