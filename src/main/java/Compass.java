public class Compass {

    public enum Point{NORTH, SOUTH, WEST, EAST};
    public enum Direction {LEFT_TURN,RIGHT_TURN};

    private Point point;

    public Point rotate (Point point, Direction direction) {
//        if(point.equals(Point.NORTH) && direction.equals(Direction.RIGHT_TURN)) {
//            return Point.EAST;
//        }
        if(direction.equals(Direction.RIGHT_TURN)){
            switch(point){
                case Point.NORTH -> {return Point.EAST;}
                case Point.EAST -> {return Point.SOUTH;}
                case Point.WEST -> {return Point.NORTH;}
                case Point.SOUTH -> {return Point.WEST;}
            }
        }
        return null;

    }

}
