/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE COMMAND_ACK PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Report status of a command. Includes feedback whether the command was executed.
 */
public class msg_command_ack extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_COMMAND_ACK = 77;
    public static final int MAVLINK_MSG_LENGTH = 10;
    private static final long serialVersionUID = MAVLINK_MSG_ID_COMMAND_ACK;


    /**
     * Command ID, as defined by MAV_CMD enum.
     */
    public int command;

    /**
     * See MAV_RESULT enum
     */
    public short result;

    /**
     * WIP: Also used as result_param1, it can be set with a enum containing the errors reasons of why the command was denied or the progress percentage or 255 if unknown the progress when result is MAV_RESULT_IN_PROGRESS.
     */
    public short progress;

    /**
     * WIP: Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied.
     */
    public int result_param2;

    /**
     * WIP: System which requested the command to be executed
     */
    public short target_system;

    /**
     * WIP: Component which requested the command to be executed
     */
    public short target_component;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_command_ack() {
        msgid = MAVLINK_MSG_ID_COMMAND_ACK;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_command_ack(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_COMMAND_ACK;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_COMMAND_ACK;

        packet.payload.putUnsignedShort(command);

        packet.payload.putUnsignedByte(result);

        packet.payload.putUnsignedByte(progress);

        packet.payload.putInt(result_param2);

        packet.payload.putUnsignedByte(target_system);

        packet.payload.putUnsignedByte(target_component);

        return packet;
    }

    /**
     * Decode a command_ack message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.command = payload.getUnsignedShort();

        this.result = payload.getUnsignedByte();

        this.progress = payload.getUnsignedByte();

        this.result_param2 = payload.getInt();

        this.target_system = payload.getUnsignedByte();

        this.target_component = payload.getUnsignedByte();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_COMMAND_ACK - sysid:" + sysid + " compid:" + compid + " command:" + command + " result:" + result + " progress:" + progress + " result_param2:" + result_param2 + " target_system:" + target_system + " target_component:" + target_component + "";
    }
}
        