package org.yagamipaul.hackerrank.algorithms.greedy

import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

/**
 * Jim and the orders
 * https://www.hackerrank.com/challenges/jim-and-the-orders
 * Jean Paul Manjarres Correal <paul.manjarres@gmail.com>
 */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val orders = ArrayList<Order>()
    var add = 0
    var times = mutableSetOf<Int>()

    for (i in 0 until n) {
        var t = scanner.nextInt()
        var d = scanner.nextInt()
        if (times.contains(t + d)) {
            add++
        }
        var fulfill = t + d + add
        times.add(fulfill)
        orders.add(Order(i + 1, fulfill))
    }

    orders.sortWith(OrderComparatorByFulFill())
    orders.forEach { o ->
        print("${o.id} ")
    }
}

class OrderComparatorByFulFill : Comparator<Order> {
    override fun compare(o1: Order, o2: Order): Int = o1.fulfillTime.compareTo(o2.fulfillTime)
}

data class Order(val id: Int, val fulfillTime: Int)
