package com.example.mywishlistapp

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit = {}
) {
    // R.color.white -> check res/values/colors.xml
    TopAppBar(
        title = {
            Text(text = title,
                color = colorResource(id = R.color.white),
                modifier = Modifier.padding(start = 4.dp).heightIn(max = 24.dp)
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(id = R.color.app_bar_color),
            titleContentColor = colorResource(id = R.color.white)
        ),
        scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    )
}