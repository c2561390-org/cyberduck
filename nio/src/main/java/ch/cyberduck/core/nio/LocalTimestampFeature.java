package ch.cyberduck.core.nio;

    /*
     * Copyright (c) 2002-2017 iterate GmbH. All rights reserved.
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

import ch.cyberduck.core.Path;
import ch.cyberduck.core.exception.BackgroundException;
import ch.cyberduck.core.shared.DefaultTimestampFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

public class LocalTimestampFeature extends DefaultTimestampFeature {

    private final LocalSession session;

    public LocalTimestampFeature(final LocalSession session) {
        this.session = session;
    }

    @Override
    public void setTimestamp(final Path file, final Long modified) throws BackgroundException {
        try {
            Files.setLastModifiedTime(session.toPath(file), FileTime.from(modified, TimeUnit.MILLISECONDS));
        }
        catch(IOException e) {
            throw new LocalExceptionMappingService().map("Failure to write attributes of {0}", e, file);
        }
    }
}