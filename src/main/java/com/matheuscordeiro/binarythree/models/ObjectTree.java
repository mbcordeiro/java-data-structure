package com.matheuscordeiro.binarythree.models;

public abstract class ObjectTree<T> implements Comparable<T> {
    public abstract boolean equals(MyObject object);
    public abstract int hashCode();
    public abstract int compareTo(T other);
    public abstract String toString();
}
