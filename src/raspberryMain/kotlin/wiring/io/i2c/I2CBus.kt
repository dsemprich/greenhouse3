package wiring.io.i2c

/**
 * This is abstraction of i2c bus. This interface allows the bus to return i2c device.
 *
 */
interface I2CBus {

    /**
     * @return The bus' number
     */
    val busNumber: Int

    /**
     * Returns i2c device.
     * @param address i2c device's address
     * @return i2c device
     */
    fun getDevice(address: Int): I2CDevice

    /**
     * Closes this bus. This usually means closing underlying file.
     */
    fun close()

    companion object {

        val BUS_0 = 0
        val BUS_1 = 1
        val BUS_2 = 2
        val BUS_3 = 3
        val BUS_4 = 4
        val BUS_5 = 5
        val BUS_6 = 6
        val BUS_7 = 7
        val BUS_8 = 8
        val BUS_9 = 9
        val BUS_10 = 10
        val BUS_11 = 11
        val BUS_12 = 12
        val BUS_13 = 13
        val BUS_14 = 14
        val BUS_15 = 15
        val BUS_16 = 16
        val BUS_17 = 17
    }
}
