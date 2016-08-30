package ch.cyberduck.core.preferences;

/*
 * Copyright (c) 2002-2014 David Kocher. All rights reserved.
 * http://cyberduck.io/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * Bug fixes, suggestions and comments should be sent to:
 * feedback@cyberduck.io
 */

import ch.cyberduck.core.Local;
import ch.cyberduck.core.LocalFactory;

import org.apache.log4j.Logger;

public class TemporarySupportDirectoryFinder implements SupportDirectoryFinder {
    private static final Logger log = Logger.getLogger(TemporarySupportDirectoryFinder.class);

    private final Preferences preferences = PreferencesFactory.get();

    @Override
    public Local find() {
        final Local folder = LocalFactory.get(preferences.getProperty("tmp.dir"));
        if(log.isDebugEnabled()) {
            log.debug(String.format("Use folder %s for application support directory", folder));
        }
        return folder;
    }
}
