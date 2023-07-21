package tss22.mb_pt

import androidx.compose.foundation.Image
import androidx.compose.foundation.clipScrollableContainer
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import tss22.mb_pt.data.ButtonProperties

// TODO
// - add parameters
//      - add list of buttons
//      - add text
// - add persistent data
// - Make the spacing like sir Lackner

@Composable
fun AdventureScreen() {

    val test_text = "This is a test"

    val test_list_button: List<ButtonProperties> = listOf(
        ButtonProperties("Button 1", "Screen 1"),
        ButtonProperties("Button 2", "Screen 2"),
        ButtonProperties("Button 3", "Screen 3"),
        ButtonProperties("Button 4", "Screen 4"),
        ButtonProperties("Button 5", "Screen 5"),
    )

    val stateTextScroll = rememberScrollState(0)
    // put it in a cloumn instead of a box
    Box(modifier = Modifier
        .fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.parchemin_background),
            contentDescription = "Background, parchemin",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds,

            )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .align(Alignment.End)
                    .height(IntrinsicSize.Min)
            ) {
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Reset"
                    )
                }
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .fillMaxHeight(0.74f)
            ) {
                item {
                    Text(
                        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lectus arcu bibendum at varius vel pharetra vel turpis nunc. Sed tempus urna et pharetra pharetra. Sem fringilla ut morbi tincidunt. Tellus in metus vulputate eu scelerisque felis imperdiet proin. Vestibulum lorem sed risus ultricies tristique nulla aliquet. Odio euismod lacinia at quis risus sed. Amet porttitor eget dolor morbi non arcu risus. Amet purus gravida quis blandit. Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt tortor. At imperdiet dui accumsan sit amet nulla facilisi morbi tempus.\n" +
                                "\n" +
                                "Cras adipiscing enim eu turpis egestas pretium aenean pharetra magna. Non blandit massa enim nec dui. Ornare suspendisse sed nisi lacus. Lectus vestibulum mattis ullamcorper velit. A cras semper auctor neque vitae tempus. Consectetur adipiscing elit ut aliquam purus. Lectus urna duis convallis convallis tellus. Sapien eget mi proin sed libero enim sed. Facilisis gravida neque convallis a cras semper auctor neque. In fermentum et sollicitudin ac orci phasellus. Elementum pulvinar etiam non quam lacus suspendisse. Eget nunc lobortis mattis aliquam faucibus. Suspendisse potenti nullam ac tortor vitae. Faucibus interdum posuere lorem ipsum. Orci nulla pellentesque dignissim enim sit amet venenatis urna. Morbi tincidunt ornare massa eget egestas purus. Dictum varius duis at consectetur lorem donec massa sapien faucibus.\n" +
                                "\n" +
                                "Arcu vitae elementum curabitur vitae nunc sed velit dignissim sodales. Tincidunt lobortis feugiat vivamus at augue eget arcu dictum varius. Euismod lacinia at quis risus sed vulputate. Consectetur adipiscing elit pellentesque habitant morbi tristique senectus et netus. Elementum tempus egestas sed sed. Pharetra sit amet aliquam id diam maecenas ultricies. Elementum sagittis vitae et leo. Diam maecenas sed enim ut sem viverra aliquet eget sit. Eget sit amet tellus cras adipiscing. In massa tempor nec feugiat nisl pretium fusce id velit. Commodo nulla facilisi nullam vehicula ipsum a arcu.\n" +
                                "\n" +
                                "Porttitor rhoncus dolor purus non enim praesent elementum facilisis leo. Ultricies mi eget mauris pharetra et ultrices neque ornare. Interdum velit euismod in pellentesque massa placerat duis ultricies lacus. Vel facilisis volutpat est velit egestas. Tincidunt eget nullam non nisi. Suspendisse potenti nullam ac tortor vitae purus. Facilisis magna etiam tempor orci eu lobortis elementum nibh tellus. Quam quisque id diam vel quam elementum pulvinar etiam. Sem fringilla ut morbi tincidunt augue interdum velit. Nibh tortor id aliquet lectus proin nibh. Leo in vitae turpis massa sed elementum tempus. Sit amet cursus sit amet dictum sit amet justo donec. Eu sem integer vitae justo eget. Sed adipiscing diam donec adipiscing tristique risus nec feugiat in. Dui accumsan sit amet nulla facilisi morbi. Aenean euismod elementum nisi quis eleifend. Consectetur purus ut faucibus pulvinar elementum integer. Ornare massa eget egestas purus viverra accumsan in. Venenatis tellus in metus vulputate eu scelerisque. Fermentum leo vel orci porta non pulvinar.\n" +
                                "\n" +
                                "Pharetra vel turpis nunc eget lorem dolor sed. Et ligula ullamcorper malesuada proin libero nunc consequat interdum. Praesent elementum facilisis leo vel fringilla est ullamcorper eget nulla. Turpis tincidunt id aliquet risus feugiat in ante metus. In arcu cursus euismod quis viverra nibh cras. Sed risus ultricies tristique nulla aliquet enim tortor at. Malesuada nunc vel risus commodo. In hac habitasse platea dictumst vestibulum rhoncus est pellentesque elit. Congue mauris rhoncus aenean vel elit scelerisque mauris pellentesque. Lacus suspendisse faucibus interdum posuere. Metus dictum at tempor commodo ullamcorper a. Pharetra diam sit amet nisl suscipit adipiscing bibendum est. Suscipit adipiscing bibendum est ultricies integer quis. Purus gravida quis blandit turpis cursus in. Id consectetur purus ut faucibus pulvinar elementum integer enim neque.",
                    )
                }


            }
            Spacer(modifier = Modifier.fillMaxHeight(0.1f))
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                items(test_list_button) { button ->
                    Button(onClick = { /*TODO*/ }) {
                        Text(
                            text = button.but_text
                        )
                    }
                }
            }
        }
    }
}