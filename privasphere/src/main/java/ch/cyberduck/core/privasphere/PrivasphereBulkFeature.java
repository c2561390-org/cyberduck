package ch.cyberduck.core.privasphere;

/*
 * Copyright (c) 2002-2018 iterate GmbH. All rights reserved.
 * https://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

import ch.cyberduck.core.ConnectionCallback;
import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.features.Bulk;
import ch.cyberduck.core.features.Delete;
import ch.cyberduck.core.transfer.Transfer;
import ch.cyberduck.core.transfer.TransferStatus;

import java.util.Map;

public class PrivasphereBulkFeature implements Bulk<Object> {


    /**
     * Prepare upload, i.e. generate session key with associated encryption parameters, sha checksums, mime type, etc
     */
    @Override
    public Object pre(final Transfer.Type type, final Map<Path, TransferStatus> map, final ConnectionCallback connectionCallback) throws BackgroundException {
        return null;
    }

    @Override
    public void post(final Transfer.Type type, final Map<Path, TransferStatus> map, final ConnectionCallback connectionCallback) throws BackgroundException {
        //
    }

    @Override
    public Bulk<Object> withDelete(final Delete delete) {
        return this;
    }
}