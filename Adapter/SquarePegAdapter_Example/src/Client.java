public class Client {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        hole.fits(rpeg); // true

        SquarePeg small_sqpeg = new SquarePeg(5);
        SquarePeg large_sqpeg = new SquarePeg(10);
        //hole.fits(small_sqpeg); // this won't compile (incompatible types)

        SquarePegAdapter small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg);
        SquarePegAdapter large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg);
        hole.fits(small_sqpeg_adapter); // true
        hole.fits(large_sqpeg_adapter); // false

    }
}
