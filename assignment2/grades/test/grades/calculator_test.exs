defmodule Grades.CalculatorTest do
  use ExUnit.Case
  alias Grades.Calculator

  describe "percentage_grade/1" do
    test "TC1" do
      assert 0 ==
               Calculator.percentage_grade(%{
                 homework: [0],
                 labs: [0, 0, 0],
                 midterm: 0.00,
                 final: 0.0
               })
    end

    test "TC2" do
      assert 80 ==
               Calculator.percentage_grade(%{
                 homework: [0.8],
                 labs: [0.8, 0.8, 0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end
  end

  describe "letter_grade/1" do
    test "TC3" do
      assert "EIN" ==
               Calculator.letter_grade(%{
                 homework: [0],
                 labs: [0.0, 0.0, 0],
                 midterm: 0.0,
                 final: 0.0
               })
    end

    test "TC4" do
      assert "A+" ==
               Calculator.letter_grade(%{
                 homework: [0.9],
                 labs: [0.9, 0.9, 0.9],
                 midterm: 0.9,
                 final: 0.9
               })
    end

    test "TC5" do
      assert "A" ==
               Calculator.letter_grade(%{
                 homework: [0.85],
                 labs: [0.85, 0.85, 0.85],
                 midterm: 0.85,
                 final: 0.85
               })
    end

    test "TC6" do
      assert "A-" ==
               Calculator.letter_grade(%{
                 homework: [0.8],
                 labs: [0.8, 0.8, 0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end

    test "TC7" do
      assert "B+" ==
               Calculator.letter_grade(%{
                 homework: [0.75],
                 labs: [0.75, 0.75, 0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end

    test "TC8" do
      assert "B" ==
               Calculator.letter_grade(%{
                 homework: [0.7],
                 labs: [0.7, 0.7, 0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end

    test "TC9" do
      assert "C+" ==
               Calculator.letter_grade(%{
                 homework: [0.65],
                 labs: [0.65, 0.65, 0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end

    test "TC10" do
      assert "C" ==
               Calculator.letter_grade(%{
                 homework: [0.6],
                 labs: [0.6, 0.6, 0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end

    test "TC11" do
      assert "D+" ==
               Calculator.letter_grade(%{
                 homework: [0.55],
                 labs: [0.55, 0.55, 0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end

    test "TC12" do
      assert "D" ==
               Calculator.letter_grade(%{
                 homework: [0.5],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.5,
                 final: 0.5
               })
    end

    test "TC13" do
      assert "E" ==
               Calculator.letter_grade(%{
                 homework: [0.4],
                 labs: [0.4, 0.4, 0.4],
                 midterm: 0.4,
                 final: 0.4
               })
    end

    test "TC14" do
      assert "F" ==
               Calculator.letter_grade(%{
                 homework: [0.41],
                 labs: [0.0, 0.0, 0.0],
                 midterm: 0.41,
                 final: 0.41
               })
    end
  end

  describe "numeric_grade/1" do
    test "TC4" do
      assert 10 ==
               Calculator.numeric_grade(%{
                 homework: [0.9],
                 labs: [0.9, 0.9, 0.9],
                 midterm: 0.9,
                 final: 0.9
               })
    end

    test "TC5" do
      assert 9 ==
               Calculator.numeric_grade(%{
                 homework: [0.85],
                 labs: [0.85, 0.85, 0.85],
                 midterm: 0.85,
                 final: 0.85
               })
    end

    test "TC6" do
      assert 8 ==
               Calculator.numeric_grade(%{
                 homework: [0.8],
                 labs: [0.8, 0.8, 0.8],
                 midterm: 0.8,
                 final: 0.8
               })
    end

    test "TC7" do
      assert 7 ==
               Calculator.numeric_grade(%{
                 homework: [0.75],
                 labs: [0.75, 0.75, 0.75],
                 midterm: 0.75,
                 final: 0.75
               })
    end

    test "TC8" do
      assert 6 ==
               Calculator.numeric_grade(%{
                 homework: [0.7],
                 labs: [0.7, 0.7, 0.7],
                 midterm: 0.7,
                 final: 0.7
               })
    end

    test "TC9" do
      assert 5 ==
               Calculator.numeric_grade(%{
                 homework: [0.65],
                 labs: [0.65, 0.65, 0.65],
                 midterm: 0.65,
                 final: 0.65
               })
    end

    test "TC10" do
      assert 4 ==
               Calculator.numeric_grade(%{
                 homework: [0.6],
                 labs: [0.6, 0.6, 0.6],
                 midterm: 0.6,
                 final: 0.6
               })
    end

    test "TC11" do
      assert 3 ==
               Calculator.numeric_grade(%{
                 homework: [0.55],
                 labs: [0.55, 0.55, 0.55],
                 midterm: 0.55,
                 final: 0.55
               })
    end

    test "TC12" do
      assert 2 ==
               Calculator.numeric_grade(%{
                 homework: [0.5],
                 labs: [0.5, 0.5, 0.5],
                 midterm: 0.5,
                 final: 0.5
               })
    end

    test "TC13" do
      assert 1 ==
               Calculator.numeric_grade(%{
                 homework: [0.4],
                 labs: [0.4, 0.4, 0.4],
                 midterm: 0.4,
                 final: 0.4
               })
    end

    test "TC14" do
      assert 0 ==
               Calculator.numeric_grade(%{
                 homework: [0.41],
                 labs: [0.0, 0.0, 0.0],
                 midterm: 0.41,
                 final: 0.41
               })
    end
  end
end
