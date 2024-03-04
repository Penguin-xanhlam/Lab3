
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class GeometryCalculatorTest {

    @Test
    public void testCalculateRectangleArea_CorrectInput() {
        assertEquals(20.0, GeometryCalculator.calculateRectangleArea(4.0, 5.0), 0.0001);

    }

    @Test
    public void testCalculateRectangleArea_IncorrectInput() {
        
        // Sai kết quả mong đợi
        assertNotEquals(22.0, GeometryCalculator.calculateRectangleArea(4.0, 5.0), 0.0001);
        
        
        // Đầu vào âm
        assertNotEquals(20.0, GeometryCalculator.calculateRectangleArea(-4.0, 5.0), 0.0001);

        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);

        
        // Đầu vào là kí tự không phải số
        String input2 = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);

        
        // Đầu vào là chuỗi chứa kí tự đặc biệt
        String input3 = "!@#$\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);

    }

    @Test
    public void testCalculateRectanglePerimeter_CorrectInput() {
        
        assertEquals(18.0, GeometryCalculator.calculateRectanglePerimeter(4.0, 5.0), 0.0001);

        
    }
    

    @Test
    public void testCalculateRectanglePerimeter_IncorrectInput() {
        
        // Sai kết quả mong đợi
        assertNotEquals(19.0, GeometryCalculator.calculateRectanglePerimeter(4.0, 5.0), 0.0001);
        
        // Đầu vào âm
        assertNotEquals(18.0, GeometryCalculator.calculateRectanglePerimeter(-4.0, 5.0), 0.0001);
        

        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);
        

        // Đầu vào là kí tự không phải số
        String input2 = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);

        
        // Đầu vào là chuỗi chứa dấu chấm động
        String input5 = "3.14\n";
        System.setIn(new java.io.ByteArrayInputStream(input5.getBytes()));
        assertEquals(3.14, GeometryCalculator.getInput("Test: "), 0.0001);
        System.setIn(System.in);
    }

    @Test
    public void testCalculateTrapezoidArea_CorrectInput() {
        
        assertEquals(15.0, GeometryCalculator.calculateTrapezoidArea(3.0, 7.0, 3.0), 0.0001);

        
    }

    @Test
    public void testCalculateTrapezoidArea_IncorrectInput() {
        
        
        // Sai kết quả mong đợi
        assertNotEquals(16.0, GeometryCalculator.calculateTrapezoidArea(3.0, 7.0, 3.0), 0.0001);
        
        
        // Đầu vào âm
        assertNotEquals(15.0, GeometryCalculator.calculateTrapezoidArea(-3.0, 7.0, 3.0), 0.0001);

        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);

        
        // Đầu vào là chuỗi chứa kí tự đặc biệt và số
        String input3 = "!@#$123\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Special Character and Number): ")));
        System.setIn(System.in);
        

        // Đầu vào là chuỗi chứa dấu chấm động và kí tự đặc biệt
        String input4 = "3.14!@#\n";
        System.setIn(new java.io.ByteArrayInputStream(input4.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Float and Special Character): ")));
        System.setIn(System.in);

    }

    @Test
    public void testCalculateTrapezoidPerimeter_CorrectInput() {
        
        assertFalse(Double.isNaN(GeometryCalculator.calculateTrapezoidPerimeter(3.0, 7.0, 3.0)));

        
    }
    

    @Test
    public void testCalculateTrapezoidPerimeter_IncorrectInput() {
        
        
        // Kết quả là NaN
        assertTrue(Double.isNaN(GeometryCalculator.calculateTrapezoidPerimeter(3.0, 7.0, -3.0)));
        
        
        // Đầu vào âm
        assertTrue(Double.isNaN(GeometryCalculator.calculateTrapezoidPerimeter(3.0, -7.0, 3.0)));

        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);

        
        // Đầu vào là kí tự không phải số hoặc dấu chấm động
        String input2 = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Non-numeric Character): ")));
        System.setIn(System.in);

        
        
        // Đầu vào là chuỗi chứa dấu chấm động và kí tự đặc biệt
        String input4 = "3.14!@#\n";
        System.setIn(new java.io.ByteArrayInputStream(input4.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Float and Special Character): ")));
        System.setIn(System.in);
        
        

        // Đầu vào là chuỗi chứa kí tự số và dấu chấm động
        String input5 = "123.456\n";
        System.setIn(new java.io.ByteArrayInputStream(input5.getBytes()));
        assertEquals(123.456, GeometryCalculator.getInput("Test (Numeric with Float): "), 0.0001);
        System.setIn(System.in);
    }

    @Test    
    public void testCalculateCircleArea_CorrectInput() {
        
        assertEquals(Math.PI * 25.0, GeometryCalculator.calculateCircleArea(5.0), 0.0001);

    }

    @Test
    public void testCalculateCircleArea_IncorrectInput() {
        
        
        // Sai kết quả mong đợi
        assertNotEquals(Math.PI * 30.0, GeometryCalculator.calculateCircleArea(5.0), 0.0001);
        
        
        // Đầu vào âm
        assertNotEquals(Math.PI * 25.0, GeometryCalculator.calculateCircleArea(-5.0), 0.0001);

        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);

        
        // Đầu vào là kí tự không phải số hoặc dấu chấm động
        String input2 = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Non-numeric Character): ")));
        System.setIn(System.in);
        

        // Đầu vào là chuỗi chứa kí tự đặc biệt và số
        String input3 = "!@#$123\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Special Character and Number): ")));
        System.setIn(System.in);

    }

    @Test
    public void testCalculateCirclePerimeter_CorrectInput() {
        
        assertEquals(2 * Math.PI * 5.0, GeometryCalculator.calculateCirclePerimeter(5.0), 0.0001);
        

    }

    @Test
    public void testCalculateCirclePerimeter_IncorrectInput() {
        
        
        // Sai kết quả mong đợi
        assertNotEquals(2 * Math.PI * 6.0, GeometryCalculator.calculateCirclePerimeter(5.0), 0.0001);
        
        
        // Đầu vào âm
        assertNotEquals(2 * Math.PI * 5.0, GeometryCalculator.calculateCirclePerimeter(-5.0), 0.0001);

        
        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);

        
        
        // Đầu vào là kí tự không phải số hoặc dấu chấm động
        String input2 = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Non-numeric Character): ")));
        System.setIn(System.in);

        
        
        // Đầu vào là chuỗi chứa kí tự đặc biệt và số
        String input3 = "!@#$123\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Special Character and Number): ")));
        System.setIn(System.in);

    }

    @Test
    public void testCalculateTriangleArea_CorrectInput() {
        
        assertEquals(10.0, GeometryCalculator.calculateTriangleArea(5.0, 4.0), 0.0001);
        

    }

    @Test
    public void testCalculateTriangleArea_IncorrectInput() {
        
        
        // Sai kết quả mong đợi
        assertNotEquals(12.0, GeometryCalculator.calculateTriangleArea(5.0, 4.0), 0.0001);
        
        
        // Đầu vào âm
        assertNotEquals(10.0, GeometryCalculator.calculateTriangleArea(-5.0, 4.0), 0.0001);
        

        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);
        

        // Đầu vào là chuỗi chứa kí tự đặc biệt và số
        String input3 = "!@#$123\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Special Character and Number): ")));
        System.setIn(System.in);
        

        // Đầu vào là chuỗi chứa kí tự số và dấu chấm động
        String input5 = "123.456\n";
        System.setIn(new java.io.ByteArrayInputStream(input5.getBytes()));
        assertEquals(123.456, GeometryCalculator.getInput("Test (Numeric with Float): "), 0.0001);
        System.setIn(System.in);
    }

    @Test
    public void testCalculateTrianglePerimeter_CorrectInput() {
        
        assertEquals(12.0 + Math.sqrt(41.0), GeometryCalculator.calculateTrianglePerimeter(5.0, 4.0), 0.0001);

    }

    @Test
    public void testCalculateTrianglePerimeter_IncorrectInput() {
        
        
        // Sai kết quả mong đợi
        assertNotEquals(14.0 + Math.sqrt(41.0), GeometryCalculator.calculateTrianglePerimeter(5.0, 4.0), 0.0001);
        // Đầu vào âm
        assertNotEquals(12.0 + Math.sqrt(41.0), GeometryCalculator.calculateTrianglePerimeter(-5.0, 4.0), 0.0001);

        
        // Đầu vào là chuỗi trống
        String input1 = "\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Empty String): ")));
        System.setIn(System.in);

        
        // Đầu vào là chuỗi chứa kí tự đặc biệt và số
        String input3 = "!@#$123\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test (Special Character and Number): ")));
        System.setIn(System.in);

    }

    @Test
    public void testGetInput_CorrectInput() {
        
        String input1 = "5.0\n";
        System.setIn(new java.io.ByteArrayInputStream(input1.getBytes()));
        assertEquals(5.0, GeometryCalculator.getInput("Test: "), 0.0001);
        System.setIn(System.in);

        
        String input2 = "10.5\n";
        System.setIn(new java.io.ByteArrayInputStream(input2.getBytes()));
        assertEquals(10.5, GeometryCalculator.getInput("Test: "), 0.0001);
        System.setIn(System.in);

        
        String input3 = "123.456\n";
        System.setIn(new java.io.ByteArrayInputStream(input3.getBytes()));
        assertEquals(123.456, GeometryCalculator.getInput("Test: "), 0.0001);
        System.setIn(System.in);
    }

    @Test
    public void testGetInput_IncorrectInput() {
        
        String input = "abc\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        
        // Đầu vào không phải là số
        
        assertTrue(Double.isNaN(GeometryCalculator.getInput("Test: ")));
        System.setIn(System.in);
        
    }

}
