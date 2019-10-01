/**
 * This class represents a House which has a pyramidal roof and a base. The
 * House contains many cuboidal rooms which are made of rectangular walls. The
 * pyramidal roof has a rectangular base and triangular walls.
 * 
 * @author Shubhi Jain, Aviral Agrawal, Sarthak Moorjani
 * @version September 3, 2018
 */
public class House {

    /**
     * This is an array of Cuboids (rooms). It is initialized with maxNoOfRooms in
     * the constructor. Each Cuboid represents a room.
     */
    public Cuboid rooms[];

    /**
     * This represents the roof of the House which is pyramidal in shape.
     */
    public Pyramid houseTop;

    /**
     * This represents the Type of the House. The House is commercial if the type is
     * 'c' or it is residential if the type is 'r'.
     */
    private char houseType;

    /**
     * This is used to maintain the count of the rooms in a House. The count
     * increases by 1 everytime the constructor of Cuboid is called.
     */
    private int countRooms;

    /**
     * This represents the house number which is unique for each House.
     */
    private int houseNumber;

    /**
     * This represents the length of the entire House inside which the rooms are
     * constructed.
     */
    private int baseLength;

    /**
     * This represents the width of the entire House inside which the rooms are
     * constructed.
     */
    private int baseWidth;

    /**
     * This represents the height of the cuboidal part of the House, i.e. the height
     * of the House excluding the roof. This height is same for all the rooms of the
     * House.
     */
    private int height;

    /**
     * This represents the height of the pyramidal roof of the House.
     */
    private int pyramidHeight;

    /**
     * Constructor for objects of class House. All variables are initialised with
     * the values given.
     * 
     * @param maxNoOfRooms  The array rooms[] is initialised with maxNoOfRooms.
     * @param houseNumber   specifies the houseNumber of the house.
     * @param baseLength    Denotes the length of the base of the entire house
     * @param baseWidth     Denotes the width of the base of the entire house
     * @param height        Denotes the height of the base structure of the house.
     *                      Note that height of each room is same
     * @param pyramidHeight Denotes the height of the pyramidal structure of the
     *                      house
     * @param houseType     Tells whether the house is residential or commercial
     */
    public House(int maxNoOfRooms, int houseNumber, int baseLength, int baseWidth, int height, int pyramidHeight,
            char houseType) {
        this.houseType = houseType;
        this.rooms = new Cuboid[maxNoOfRooms];
        this.houseNumber = houseNumber;
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
        this.pyramidHeight = pyramidHeight;
    }

    /**
     * This class represents a room which is Cuboidal in shape. The room is made up
     * of 6 rectangular walls.
     */
    public class Cuboid {

        /**
         * This represents the length of a room in the House.
         */
        private int roomLength;

        /**
         * This represents the cost of a room in the House.
         */
        private int cost;

        /**
         * This represents the width of a room in the House.
         */
        private int roomWidth;

        /**
         * This represents the height of a room in the House which is same as the height
         * of the House (excluding the roof).
         */
        private int roomHeight;

        /**
         * This is an array of Rectangles which represents the 6 walls in a room.
         */
        public Rectangle walls[];

        /**
         * Constructor for objects of class Cuboid. roomHeight is initialised with the
         * height of the House. Initialize the walls array with 6 walls (rectangles)
         * 
         * @param length Used to initialise the roomLength of the room.
         * @param width  Used to initialise the roomWidth of the room.
         * @param cost   Used to initialise the cost of a room in a commercial House.
         */
        public Cuboid(int length, int width, int cost) {
            walls = new Rectangle[6];
            countRooms++;
            this.cost = cost;
            this.roomLength = length;
            this.roomWidth = width;
            this.roomHeight = House.this.height;
        }

        /**
         * Constructor for objects of class Cuboid. The cost of a room in a residential
         * House is initialised. The cost of a room in a residential house is 0.
         * roomHeight is initialised with the height of the House.
         * 
         * @param length Used to initialise the roomLength of the House
         * @param width  Used to initialise the roomWidth of the House
         */
        public Cuboid(int length, int width) {
            walls = new Rectangle[6];
            countRooms++;
            this.cost = 0;
            this.roomLength = length;
            this.roomWidth = width;
            this.roomHeight = House.this.height;
        }

        /**
         * This class represents the walls of the house which are rectangular in shape.
         */
        public class Rectangle {

            /**
             * This tells the type of the wall. The wall type is 'w' if the wall is
             * constructed along the width of the house. The wall type is 'l' if the wall is
             * constructed along the length of the house. The wall type is 'f' or 'c' if the
             * wall represents the floor or the ceiling respectively. However, you do not
             * need to worry much about it. It is made sure that in the constructor, a
             * correct value is passed
             */
            private char wallType;

            /**
             * This is the length of the wall which will be assigned depending upon the
             * wallstate. If the wallType is 'w', then the wallLength is the roomWidth. If
             * the wallType is 'l' then the wallLength is the roomLength. Otherwise the
             * wallLength is the roomLength itself.
             */
            private int wallLength;

            /**
             * The wallWidth is always the roomHeight except in the cases when wallType is
             * 'f' or 'c' in which case the wallWidth is the roomWidth itself.
             */
            private int wallWidth;

            /**
             * This denotes the wallState of the wall.
             */
            private char wallState;

            /**
             * Constructor for objects of class Rectangle
             * 
             * @param wallType  Initialises the wallType of the Rectangle by the given
             *                  value.
             * 
             * @param isRaining isRaining is a boolean variable which is used to initialise
             *                  the wallSTate of the Wall. If it is raining, i.e. if
             *                  isRaining is true, then wallState must be assigned 'b' (bad)
             *                  otherwise, it must be assigned 'g' (good) So, a wall is said
             *                  to be good if it is in good state and bad if it is in bad
             *                  state
             */
            public Rectangle(char wallType, boolean isRaining) {
                this.wallType = wallType;
                if (this.wallType == 'w') {
                    this.wallLength = Cuboid.this.roomWidth;
                    this.wallWidth = Cuboid.this.roomHeight;
                } else if (this.wallType == 'l') {
                    this.wallLength = Cuboid.this.roomLength;
                    this.wallWidth = Cuboid.this.roomHeight;
                } else if (this.wallType == 'f' || this.wallType == 'c') {
                    this.wallLength = Cuboid.this.roomLength;
                    this.wallWidth = Cuboid.this.roomWidth;
                }
                if (isRaining) {
                    this.wallState = 'b';
                } else {
                    this.wallState = 'g';
                }
            }

            /**
             * This method aims to calculate the area of the wall.
             * 
             * @return Returns the Area of the wall. Area of a rectangle is given by
             *         wallLength*wallWidth
             */

            public int getArea() {
                return wallLength * wallWidth;
            }

            /**
             * This method aims to get the current wall condition.
             * 
             * @return Returns the current wallState
             */

            public char getWallCondition() {
                return wallState;
            }

        }

        /**
         * This method aims to get the cost of the room.
         * 
         * @return Returns the cost of the room.
         */
        public int getCost() {
            return cost;
        }

        /**
         * This method aims to get the volume of the room
         * 
         * @return Returns the volume of the room. Volume of the room is defined as the
         *         roomLength*roomWidth*roomHeight.
         */
        public int getVolume() {
            return (this.roomLength * this.roomWidth * this.roomHeight);
        }

    }

    /**
     * This class represents the roof of the House which is pyramidal in shape. The
     * pyramid has a rectangular base and is made of 4 triangular walls.
     */
    public class Pyramid {

        /**
         * This is an array of Triangles which represents the 4 walls in the roof.
         */
        public Triangle roofWalls[];

        /**
         * This represents the height of the pyramidal roof.
         */
        private int pyramidHeight;

        /**
         * This represents the base length of the pyramidal roof.
         */
        private int pyramidBaseLength;

        /**
         * This represents the base width of the pyramidal roof.
         */
        private int pyramidBaseWidth;

        /**
         * Constructor for objects of class Pyramid. This is used to initialise the
         * pyramidHeight with the pyramidHeight of the House, the pyramidBaseLength with
         * baseLength of the House and the pyramidBaseWidth with baseWidth of the House.
         * Also initialize the roofWalls wih 4 walls (Triangles).
         */
        public Pyramid() {
            roofWalls = new Triangle[4];
            this.pyramidHeight = House.this.pyramidHeight;
            this.pyramidBaseLength = House.this.baseLength;
            this.pyramidBaseWidth = House.this.baseWidth;
        }

        /**
         * This method aims to get the volume of the upper part of the house (The
         * pyramidal part) Volume of the pyramid is defined as the
         * (pyramidHeight*pyramidBaseLength*pyramidBaseWidth)/3
         * 
         * @return Returns the volume of the upper part of the house (The pyramidal
         *         part).
         */
        public int getVolume() {
            return (pyramidHeight * pyramidBaseLength * pyramidBaseWidth) / 3;
        }

        /**
         * This method aims to get the surface area of the upper part of the house (The
         * pyramidal part) Surface Area of the pyramid is defined as the sum of areas of
         * the 4 triangular walls which construct the upper part.
         * 
         * @return Returns the surface area of the upper part of the house (The
         *         pyramidal part).
         */
        public int getSurfaceArea() {
            int area = 0;
            for (int i = 0; i < 4; i++) {
                area += roofWalls[i].getTriangleArea();
            }
            return area;
        }

        /**
         * This class represents the walls of the roof of the House. The walls of the
         * roof are triangular in shape.
         */
        public class Triangle {

            /**
             * This represents the type of the triangular wall. If triangleType is 'w' then
             * the wall is constructed along the width of the house. If triangleType is 'l'
             * then the wall is constructed along the length of the house.
             */
            private char triangleType;

            /**
             * This represents the base of a triangle.
             */
            private int baseSide;

            /**
             * This represents side1 of a triangle.
             */
            private int wallSide1;

            /**
             * This represents side2 of a triangle
             */
            private int wallSide2;

            /**
             * Constructor for the Objects of the Triangle class.
             * 
             * @param triangleType If the triangleType is 'w' then baseSide is
             *                     pyramidBaseWidth and if it is 'l' then the baseSide is
             *                     pyramidBaseLength
             * @param side1        Used to initialise wallSide1 of the Triangle.
             * @param side2        Used to initialise wallSide2 of the Triangle.
             */
            public Triangle(char triangleType, int side1, int side2) {
                this.triangleType = triangleType;
                if (this.triangleType == 'w') {
                    baseSide = Pyramid.this.pyramidBaseWidth;
                } else if (this.triangleType == 'l') {
                    baseSide = Pyramid.this.pyramidBaseLength;
                }
                this.wallSide1 = side1;
                this.wallSide2 = side2;

            }

            /**
             * This method aims to get the area of a triangular wall which is one of the
             * walls of the pyramid. Area of the triangular wall is given by the Square of
             * the Herons formula. Remember, we are not taking the square root in the Herons
             * formula. Hence if, a,b and c are the sides of the triangle and s = (a+b+c)/2,
             * then the area is given by s*(s-a)*(s-b)*(s-c).
             * 
             * @return Returns the area of the triangular wall.
             */
            public int getTriangleArea() {
                // return baseLength;
                int s = (baseSide + wallSide1 + wallSide2) / 2;
                return (s) * (s - baseSide) * (s - wallSide1) * (s - wallSide2);
            }
        }
    }

    /**
     * This method returns the housenumber of the house.
     * 
     * @return the housenumber of the house
     */
    public int getHouseNumber() {
        return this.houseNumber;
    }

    /**
     * This method returns the number of rooms in the house.
     * 
     * @return Returns the number of rooms in the house.
     */
    public int getCountRooms() {
        return this.countRooms;
    }

    /**
     * This method aims to return the total number of bad walls in each room of the
     * house. For example, if there are 2 rooms and both rooms have 4 bad walls,
     * then return 8.
     * 
     * @return Returns the total number of bad walls in each room of the house.
     */
    public int getBadWalls() {
        int badWalls = 0;
        for (int i = 0; i < countRooms; i++) {
            for (int j = 0; j < 6; j++) {
                if (rooms[i].walls[j].getWallCondition() == 'b')
                    badWalls++;
            }
        }
        return badWalls;
    }

    /**
     * The volume of the house is given by baseLength*baseWidth*height + volume of
     * the pyramid
     * 
     * @return Returns the volume of the house.
     */
    public int houseVolume() {
        return baseLength * baseWidth * height + houseTop.getVolume();
    }

    /**
     * The free space in the house is the unconstructed part of the base of the
     * house. As mentioned in the lab statement it is possible that the entire house
     * is not constructed that is the sum of volumes of all the rooms may not equal
     * the volume of the base. So we want you to find the empty/freespace in the
     * base of the house. Note that the free space does not include the pyramidal
     * roof of the house.
     * 
     * @return Returns the free space in the house.
     */
    public int freeSpace() {
        int total = this.houseVolume() - houseTop.getVolume();
        int occupied = 0;
        for (int i = 0; i < countRooms; i++) {
            occupied += rooms[i].getVolume();
        }
        return total - occupied;
    }

    /**
     * If the house is commercial then the revenue generated is the sum of the cost
     * of each room in the house. If the house is residential then the revenue
     * generated is the surfaceArea of the house.
     * 
     * @return Returns the revenue generated by the house.
     */
    public int getRent() {
        int totalRent = 0;
        for (int i = 0; i < countRooms; i++) {
            totalRent += rooms[i].getCost();
        }
        if (houseType == 'c')
            return totalRent;
        return this.getSurfaceArea();
    }

    /**
     * This method returns the type of the house i.e. residential or commercial
     * 
     * @return Returns the type of the house.
     */
    public char getHouseType() {
        return houseType;

    }

    /**
     * Surface area of the house is generated as: 2*height*(baseLength+baseWidth) +
     * surface area of the pyramidal roof.
     * 
     * @return Returns the surface area of the house.
     */
    public int getSurfaceArea() {
        return 2 * height * (baseLength + baseWidth) + houseTop.getSurfaceArea();
    }
}
