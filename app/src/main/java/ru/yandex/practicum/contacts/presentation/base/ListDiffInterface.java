package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    /**
     * Compares values with each other
     * @param compared - the value to be compared
     * @return `true` if values the same, `false` otherwise
     */
    boolean theSameAs(T compared);

    /**
     * Checks whether objects are equal
     * @param object - the object to be checked on equality
     * @return `true` if objects are equal, `false` otherwise
     */
    boolean equals(Object object);
}
