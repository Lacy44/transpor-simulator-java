# Java OOP Project – Day 2

This project demonstrates the use of Interfaces and Polymorphism in Java.

## Concepts Covered:
- Interface creation and implementation
- Method overriding
- Polymorphism using interface references

## Interface:public interface Transport {
    void move();
    String getFuelType();
}

## Implemented Classes:
- Car – Moves on the road, uses petrol
- Plane – Flies in the sky, uses jet fuel
- Ship – Moves in the sea, uses diesel

## Example Output:Fuel type: Petrol
Car is moving on the road
Fuel type: Jet Fuel
Plane is moving in the sky
Fuel type: Diesel
Ship is moving in the sea

## Usage:
Each class implements the Transport interface. In the Main class, polymorphism is demonstrated by calling move() and getFuelType() on Transport references.

This project is a beginner-level exercise to understand abstraction and polymorphism in Java.
