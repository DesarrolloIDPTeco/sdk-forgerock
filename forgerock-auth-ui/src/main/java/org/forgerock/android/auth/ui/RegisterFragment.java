/*
 * Copyright (c) 2019 ForgeRock. All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */

package org.forgerock.android.auth.ui;

import static android.view.View.VISIBLE;

public class RegisterFragment extends LoginFragment {

    @Override
    public void start() {
        progressBar.setVisibility(VISIBLE);
        viewModel.register(getContext());
    }
}
