/**
 * Copyright (c) 2015 Zenika
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Mario Loriedo @mariolet - Initial implementation
 */
package com.zenika.doclipser.dsl.ui;

import static com.zenika.doclipser.dsl.ui.internal.DockerfileDslActivator.COM_ZENIKA_DOCLIPSER_DSL_DOCKERFILEDSL;

import com.google.inject.Injector;
import com.zenika.doclipser.dsl.ui.internal.DockerfileDslActivator;

public class InjectorProvider {
    public Injector getInjector() {
        return DockerfileDslActivator.getInstance().getInjector(
                COM_ZENIKA_DOCLIPSER_DSL_DOCKERFILEDSL);
    }
}
