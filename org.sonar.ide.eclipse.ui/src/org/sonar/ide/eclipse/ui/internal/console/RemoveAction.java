/*
 * SonarQube Eclipse
 * Copyright (C) 2010-2014 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.ide.eclipse.ui.internal.console;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.sonar.ide.eclipse.ui.internal.Messages;
import org.sonar.ide.eclipse.ui.internal.SonarUiPlugin;

public class RemoveAction extends Action {

  public RemoveAction() {
    setToolTipText(Messages.SonarConsoleRemoveAction_tooltip);
    setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ELCL_REMOVE));
  }

  public void run() {
    SonarUiPlugin.getDefault().getSonarConsole().closeConsole();
  }

}