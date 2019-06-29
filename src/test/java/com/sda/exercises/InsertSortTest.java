package com.sda.exercises;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertSortTest {

    @Test
    public void sort() {
        //given
        InsertSort insertSout = new InsertSort();
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(9,4,6,2,8,5,1,3,7));
        //when
        List<Integer> returned=insertSout.sort(unsortedList);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        //then
        Assert.assertEquals(returned, expected);
    }

    @Test
    public void sort1() {
        //given
        InsertSort insertSout = new InsertSort();
        List<Integer> unsortedList = new ArrayList<>();
        //when
        List<Integer> returned=insertSout.sort(unsortedList);
        List<Integer> expected = new ArrayList<>();
        //then
        Assert.assertEquals(returned, expected);
    }
}