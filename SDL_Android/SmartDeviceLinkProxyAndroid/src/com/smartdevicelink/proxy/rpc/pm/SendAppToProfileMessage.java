/**
 *
 * SDLP SDK
 * Cross Platform Application Communication Stack for In-Vehicle Applications
 *
 * Copyright (C) 2013, Luxoft Professional Corp., member of IBS group
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; version 2.1.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 *
 *
 */
package com.smartdevicelink.proxy.rpc.pm;

import java.util.Hashtable;

import com.smartdevicelink.proxy.constants.Names;

public class SendAppToProfileMessage extends RPCProfileManagerRequest {

    public SendAppToProfileMessage(String profileID, Integer correlationID, byte[] messageData) {
        super(Names.sendAppToProfileMessage, profileID, correlationID);
        setMessage(messageData);
    }

    public SendAppToProfileMessage(Hashtable hash) {
        super(hash);
    }

    public byte[] getMessage() {
        return getBulkData();
    }

    public void setMessage(byte[] message) {
        setBulkData(message);
    }
}
