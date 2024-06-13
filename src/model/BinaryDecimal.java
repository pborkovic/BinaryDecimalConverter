package model;

public class BinaryDecimal {

    public static String convert2Bin (String decimal)throws NumberFormatException{

        return Integer.toBinaryString(Integer.parseInt(decimal));

    }

    public static String convert2Dec (String binary) throws NumberFormatException{

        return String.format("%d", Integer.parseInt(binary, 2));
    }
}
