package hu.bme.mit.train.sensor;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;


public class Tachograph {
    public Table<Double, Double, Double> table = HashBasedTable.create();
}