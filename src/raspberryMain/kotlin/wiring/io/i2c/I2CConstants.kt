package wiring.io.i2c

/**
 * These are constants scraped directly from linux kernel (i2c-dev.h i2c.h). They are to
 * be used with advanced I2C ioctl.
 */
object I2CConstants {
    /* Flags for i2c_msg.flags */

    var I2C_M_RD = 0x0001 /* read data, from slave to master
                                                             I2C_M_RD is guaranteed to be = 0x0001! */
    var I2C_M_TEN = 0x0010 /* this is a ten bit chip address */
    var I2C_M_RECV_LEN = 0x0400 /* length will be first received byte */
    var I2C_M_NO_RD_ACK = 0x0800 /* if I2C_FUNC_PROTOCOL_MANGLING */
    var I2C_M_IGNORE_NAK = 0x1000 /* if I2C_FUNC_PROTOCOL_MANGLING */
    var I2C_M_REV_DIR_ADDR = 0x2000 /* if I2C_FUNC_PROTOCOL_MANGLING */
    var I2C_M_NOSTART = 0x4000 /* if I2C_FUNC_NOSTART */
    var I2C_M_STOP = 0x8000 /* if I2C_FUNC_PROTOCOL_MANGLING */

    /* To determine what functionality is present */

    var I2C_FUNC_I2C = 0x00000001
    var I2C_FUNC_10BIT_ADDR = 0x00000002
    var I2C_FUNC_PROTOCOL_MANGLING = 0x00000004 /* I2C_M_IGNORE_NAK etc. */
    var I2C_FUNC_SMBUS_PEC = 0x00000008
    var I2C_FUNC_NOSTART = 0x00000010 /* I2C_M_NOSTART */
    var I2C_FUNC_SLAVE = 0x00000020
    var I2C_FUNC_SMBUS_BLOCK_PROC_CALL = 0x00008000 /* SMBus 2.0 */
    var I2C_FUNC_SMBUS_QUICK = 0x00010000
    var I2C_FUNC_SMBUS_READ_BYTE = 0x00020000
    var I2C_FUNC_SMBUS_WRITE_BYTE = 0x00040000
    var I2C_FUNC_SMBUS_READ_BYTE_DATA = 0x00080000
    var I2C_FUNC_SMBUS_WRITE_BYTE_DATA = 0x00100000
    var I2C_FUNC_SMBUS_READ_WORD_DATA = 0x00200000
    var I2C_FUNC_SMBUS_WRITE_WORD_DATA = 0x00400000
    var I2C_FUNC_SMBUS_PROC_CALL = 0x00800000
    var I2C_FUNC_SMBUS_READ_BLOCK_DATA = 0x01000000
    var I2C_FUNC_SMBUS_WRITE_BLOCK_DATA = 0x02000000
    var I2C_FUNC_SMBUS_READ_I2C_BLOCK = 0x04000000 /* I2C-like block xfer  */
    var I2C_FUNC_SMBUS_WRITE_I2C_BLOCK = 0x08000000 /* w/ 1-byte reg. addr. */
    var I2C_FUNC_SMBUS_HOST_NOTIFY = 0x10000000

    var I2C_FUNC_SMBUS_BYTE = I2C_FUNC_SMBUS_READ_BYTE or I2C_FUNC_SMBUS_WRITE_BYTE
    var I2C_FUNC_SMBUS_BYTE_DATA = I2C_FUNC_SMBUS_READ_BYTE_DATA or I2C_FUNC_SMBUS_WRITE_BYTE_DATA
    var I2C_FUNC_SMBUS_WORD_DATA = I2C_FUNC_SMBUS_READ_WORD_DATA or I2C_FUNC_SMBUS_WRITE_WORD_DATA
    var I2C_FUNC_SMBUS_BLOCK_DATA = I2C_FUNC_SMBUS_READ_BLOCK_DATA or I2C_FUNC_SMBUS_WRITE_BLOCK_DATA
    var I2C_FUNC_SMBUS_I2C_BLOCK = I2C_FUNC_SMBUS_READ_I2C_BLOCK or I2C_FUNC_SMBUS_WRITE_I2C_BLOCK

    var I2C_FUNC_SMBUS_EMUL = I2C_FUNC_SMBUS_QUICK or
            I2C_FUNC_SMBUS_BYTE or
            I2C_FUNC_SMBUS_BYTE_DATA or
            I2C_FUNC_SMBUS_WORD_DATA or
            I2C_FUNC_SMBUS_PROC_CALL or
            I2C_FUNC_SMBUS_WRITE_BLOCK_DATA or
            I2C_FUNC_SMBUS_I2C_BLOCK or
            I2C_FUNC_SMBUS_PEC

    /*
     * Data for SMBus Messages
     */
    var I2C_SMBUS_BLOCK_MAX = 32       /* As specified in SMBus standard */

    /* i2c_smbus_xfer read or write markers */
    var I2C_SMBUS_READ = 1
    var I2C_SMBUS_WRITE = 0

    /* SMBus transaction types (size parameter in the above functions)
       Note: these no longer correspond to the (arbitrary) PIIX4 internal codes! */
    var I2C_SMBUS_QUICK = 0
    var I2C_SMBUS_BYTE = 1
    var I2C_SMBUS_BYTE_DATA = 2
    var I2C_SMBUS_WORD_DATA = 3
    var I2C_SMBUS_PROC_CALL = 4
    var I2C_SMBUS_BLOCK_DATA = 5
    var I2C_SMBUS_I2C_BLOCK_BROKEN = 6
    var I2C_SMBUS_BLOCK_PROC_CALL = 7        /* SMBus 2.0 */
    var I2C_SMBUS_I2C_BLOCK_DATA = 8

    var I2C_RETRIES = 0x0701   /* number of times a device address should
                                                               be polled when not acknowledging */
    var I2C_TIMEOUT = 0x0702   /* set timeout in units of 10 ms */

    /* NOTE: Slave address is 7 or 10 bits, but 10-bit addresses
     * are NOT supported! (due to code brokenness)
     */
    var I2C_SLAVE = 0x0703   /* Use this slave address */
    var I2C_SLAVE_FORCE = 0x0706   /* Use this slave address, even if it
                                                               is already in use by a driver! */
    var I2C_TENBIT = 0x0704   /* 0 for 7 bit addrs, != 0 for 10 bit */

    var I2C_FUNCS = 0x0705   /* Get the adapter functionality mask */

    var I2C_RDWR = 0x0707   /* Combined R/W transfer (one STOP only) */

    var I2C_PEC = 0x0708   /* != 0 to use PEC with SMBus */
    var I2C_SMBUS = 0x0720   /* SMBus transfer */
}
