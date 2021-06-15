package com.atorrico.data_structures_algorithms.util

class MultiMap<K, V> {
    private var map: MutableMap<K, MutableCollection<V>?> = HashMap()

    /**
     * Add the specified value with the specified key in this multimap.
     */
    fun put(key: K, value: V) {
        if (map[key] == null) {
            map[key] = ArrayList()
        }

        map[key]!!.add(value)
    }

    /**
     * Associate the specified key with the given value if not
     * already associated with a value
     */
    fun putIfAbsent(key: K, value: V) {
        if (map[key] == null) {
            map[key] = ArrayList()
        }

        // if the value is absent, insert it
        if (!map[key]!!.contains(value)) {
            map[key]!!.add(value)
        }
    }

    /**
     * Returns the Collection of values to which the specified key is mapped,
     * or null if this multimap contains no mapping for the key.
     */
    operator fun get(key: Any?): Collection<V>? {
        return map[key]
    }

    /**
     * Returns a Set view of the keys contained in this multimap.
     */
    fun keySet(): Set<K> {
        return map.keys
    }

    /**
     * Returns a Set view of the mappings contained in this multimap.
     */
    fun entrySet(): Set<Map.Entry<K, Collection<V>?>> {
        return map.entries
    }

    /**
     * Returns a Collection view of Collection of the values present in
     * this multimap.
     */
    fun values(): Collection<Collection<V>?> {
        return map.values
    }

    /**
     * Returns true if this multimap contains a mapping for the specified key.
     */
    fun containsKey(key: Any?): Boolean {
        return map.containsKey(key)
    }

    /**
     * Removes the mapping for the specified key from this multimap if present
     * and returns the Collection of previous values associated with key, or
     * null if there was no mapping for key.
     */
    fun remove(key: Any?): Collection<V>? {
        return map.remove(key)
    }

    /**
     * Returns the total number of key-value mappings in this multimap.
     */
    fun size(): Int {
        return map.size
    }

    /**
     * Returns true if this multimap contains no key-value mappings.
     */
    val isEmpty: Boolean
        get() = map.isEmpty()

    /**
     * Removes all the mappings from this multimap.
     */
    fun clear() {
        map.clear()
    }

    /**
     * Removes the entry for the specified key only if it is currently
     * mapped to the specified value and return true if removed
     */
    fun remove(key: K, value: V): Boolean {
        return if (map[key] != null) map[key]!!.remove(value) else false
    }

    /**
     * Replaces the entry for the specified key only if currently
     * mapped to the specified value and return true if replaced
     */
    fun replace(key: K, oldValue: V, newValue: V): Boolean {
        if (map[key] != null && map[key]!!.remove(oldValue))
            return map[key]!!.add(newValue)

        return false
    }
}

fun main() {
    val multimap: MultiMap<String, String> = MultiMap()

    multimap.put("George", "Washington")
    multimap.put("George", "Bush")
    multimap.put("John", "Adams")
    multimap.put("John", "Tyler")
    multimap.put("John", "Kennedy")
    multimap.put("Zachary", "Taylor")

    println("----- Printing Multimap with keySet() function -----\n")

    for (lastName in multimap.keySet()) {
        println(lastName + ": " + multimap[lastName])
    }
}