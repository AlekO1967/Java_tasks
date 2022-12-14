package com.company;
public class Point2d {
        protected double xCoord;
        protected double yCoord;
        public Point2d ( double x, double y) {
            xCoord = x;
            yCoord = y;
        }
        public Point2d () {
            this(0, 0);
        }
        public double getX () {
            return xCoord;
        }
        public double getY () {
            return yCoord;
        }
        public void setX ( double val) {
            xCoord = val;
        }
        public void setY ( double val) {
            yCoord = val;
        }
        public boolean isEqual2D (com.company.Point2d object) {
            return this.xCoord == object.xCoord && this.yCoord == object.yCoord;
        }
}
