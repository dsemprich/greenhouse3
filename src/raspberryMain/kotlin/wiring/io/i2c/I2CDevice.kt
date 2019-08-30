package wiring.io.i2c

/**
 * This is abstraction of an i2c device. It allows data to be read or written to the device.
 *
 */
interface I2CDevice {

    /**
     * @return The address for which this instance is constructed for.
     */
    val address: Int

    /**
     * This method writes one byte directly to i2c device.
     *
     * @param b byte to be written
     *
     */
    fun write(b: Byte)

    /**
     * This method writes several bytes directly to the i2c device from given buffer at given offset.
     *
     * @param buffer buffer of data to be written to the i2c device in one go
     * @param offset offset in buffer
     * @param size number of bytes to be written
     *
     * @throws IOException thrown in case byte cannot be written to the i2c device or i2c bus
     */
    fun write(buffer: ByteArray, offset: Int, size: Int)

    /**
     * This method writes all bytes included in the given buffer directly to the i2c device.
     *
     * @param buffer buffer of data to be written to the i2c device in one go
     *
     * @throws IOException thrown in case byte cannot be written to the i2c device or i2c bus
     */
    fun write(buffer: ByteArray)

    /**
     * This method writes one byte to i2c device.
     *
     * @param address local address in the i2c device
     * @param b byte to be written
     *
     * @throws IOException thrown in case byte cannot be written to the i2c device or i2c bus
     */
    fun write(address: Int, b: Byte)

    /**
     * This method writes several bytes to the i2c device from given buffer at given offset.
     *
     * @param address local address in the i2c device
     * @param buffer buffer of data to be written to the i2c device in one go
     * @param offset offset in buffer
     * @param size number of bytes to be written
     *
     * @throws IOException thrown in case byte cannot be written to the i2c device or i2c bus
     */
    fun write(address: Int, buffer: ByteArray, offset: Int, size: Int)

    /**
     * This method writes all bytes included in the given buffer directoy to the register address on the i2c device
     *
     * @param address local address in the i2c device
     * @param buffer buffer of data to be written to the i2c device in one go
     *
     * @throws IOException thrown in case byte cannot be written to the i2c device or i2c bus
     */
    fun write(address: Int, buffer: ByteArray)

    /**
     * This method reads one byte from the i2c device.
     * Result is between 0 and 255 if read operation was successful, else a negative number for an error.
     *
     * @return byte value read: positive number (or zero) to 255 if read was successful. Negative number if reading failed.
     *
     * @throws IOException thrown in case byte cannot be read from the i2c device or i2c bus
     */
    fun read(): Int

    /**
     * This method reads bytes directly from the i2c device to given buffer at asked offset.
     *
     * @param buffer buffer of data to be read from the i2c device in one go
     * @param offset offset in buffer
     * @param size number of bytes to be read
     *
     * @return number of bytes read
     *
     * @throws IOException thrown in case byte cannot be read from the i2c device or i2c bus
     */
    fun read(buffer: ByteArray, offset: Int, size: Int): Int

    /**
     * This method reads one byte from the i2c device.
     * Result is between 0 and 255 if read operation was successful, else a negative number for an error.
     *
     * @param address local address in the i2c device
     * @return byte value read: positive number (or zero) to 255 if read was successful. Negative number if reading failed.
     *
     * @throws IOException thrown in case byte cannot be read from the i2c device or i2c bus
     */
    fun read(address: Int): Int

    /**
     * This method reads bytes from the i2c device to given buffer at asked offset.
     *
     * @param address local address in the i2c device
     * @param buffer buffer of data to be read from the i2c device in one go
     * @param offset offset in buffer
     * @param size number of bytes to be read
     *
     * @return number of bytes read
     *
     * @throws IOException thrown in case byte cannot be read from the i2c device or i2c bus
     */
    fun read(address: Int, buffer: ByteArray, offset: Int, size: Int): Int

    /**
     * Runs an ioctl on this device.
     *
     * @see com.pi4j.io.file.LinuxFile.ioctl
     */
    fun ioctl(command: Long, value: Int)

    /**
     * This method writes and reads bytes to/from the i2c device in a single method call
     *
     * @param writeBuffer buffer of data to be written to the i2c device in one go
     * @param writeOffset offset in write buffer
     * @param writeSize number of bytes to be written from buffer
     * @param readBuffer buffer of data to be read from the i2c device in one go
     * @param readOffset offset in read buffer
     * @param readSize number of bytes to be read
     *
     * @return number of bytes reads
     */
    fun read(
        writeBuffer: ByteArray,
        writeOffset: Int,
        writeSize: Int,
        readBuffer: ByteArray,
        readOffset: Int,
        readSize: Int
    ): Int

}
