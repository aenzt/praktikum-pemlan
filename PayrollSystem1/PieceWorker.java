package PayrollSystem1;

public class PieceWorker extends Employee {

    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                       double wage, int pieces)
    {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (wage < 0.0)
            throw new IllegalArgumentException
                    ("Wage must be >= 0");

        if (pieces < 0)
            throw new IllegalArgumentException
                    ("Number of pieces must be > 0");

        this.wage = wage;
        this.pieces = pieces;
    }

    public void setWage(double wage)
    {
        if (wage < 0.0)
            throw new IllegalArgumentException
                    ("Wage must be >= 0");
        this.wage = wage;
    }

    public double getWage()
    {
        return wage;
    }

    public void setPieces(int pieces)
    {
        if (pieces < 0)
            throw new IllegalArgumentException
                    ("Number of pieces must be > 0");

        this.pieces = pieces;
    }

    public int getPieces()
    {
        return pieces;
    }

    @Override
    public double earnings()
    {
        return getPieces() * getWage();
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f%n%s: %d", "Pieceworker Employee",
                super.toString(), "Wage per piece", getWage(), "Pieces sold", getPieces());
    }
}