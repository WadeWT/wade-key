package com.dessalines.thumbkey.keyboards

import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.KeyboardC
import com.dessalines.thumbkey.utils.KeyboardMode
import com.dessalines.thumbkey.utils.SwipeDirection
import com.dessalines.thumbkey.utils.SwipeNWay

val TYPESPLIT_EN_V3 = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("r"),
                    action = KeyAction.CommitText("r"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("w"),
                        action = KeyAction.CommitText("w"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("s"),
                    action = KeyAction.CommitText("s"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("g"),
                        action = KeyAction.CommitText("g"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("m"),
                        action = KeyAction.CommitText("m"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_TOP_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("t"),
                    action = KeyAction.CommitText("t"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("z"),
                        action = KeyAction.CommitText("z"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("p"),
                        action = KeyAction.CommitText("p"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("o"),
                    action = KeyAction.CommitText("o"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("b"),
                        action = KeyAction.CommitText("b"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("l"),
                    action = KeyAction.CommitText("l"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("f"),
                        action = KeyAction.CommitText("f"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("n"),
                    action = KeyAction.CommitText("n"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("y"),
                        action = KeyAction.CommitText("y"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("u"),
                        action = KeyAction.CommitText("u"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("e"),
                    action = KeyAction.CommitText("e"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("q"),
                        action = KeyAction.CommitText("q"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("k"),
                        action = KeyAction.CommitText("k"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("i"),
                    action = KeyAction.CommitText("i"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("j"),
                        action = KeyAction.CommitText("j"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("c"),
                    action = KeyAction.CommitText("c"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("h"),
                    action = KeyAction.CommitText("h"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("v"),
                        action = KeyAction.CommitText("v"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("a"),
                    action = KeyAction.CommitText("a"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("x"),
                        action = KeyAction.CommitText("x"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("d"),
                    action = KeyAction.CommitText("d"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";"),
                        color = ColorVariant.MUTED,
                    ),
                ),
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            BACKSPACE_TYPESPLIT_KEY_ITEM,
            RETURN_KEY_ITEM,
        ),
    ),
)

val TYPESPLIT_EN_V3_SHIFTED = KeyboardC(
    listOf(
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("R"),
                    action = KeyAction.CommitText("R"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("W"),
                        action = KeyAction.CommitText("W"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("S"),
                    action = KeyAction.CommitText("S"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("G"),
                        action = KeyAction.CommitText("G"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("M"),
                        action = KeyAction.CommitText("M"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_TOP_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("T"),
                    action = KeyAction.CommitText("T"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("Z"),
                        action = KeyAction.CommitText("Z"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("P"),
                        action = KeyAction.CommitText("P"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("O"),
                    action = KeyAction.CommitText("O"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("B"),
                        action = KeyAction.CommitText("B"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("L"),
                    action = KeyAction.CommitText("L"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("F"),
                        action = KeyAction.CommitText("F"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("N"),
                    action = KeyAction.CommitText("N"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Y"),
                        action = KeyAction.CommitText("Y"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("U"),
                        action = KeyAction.CommitText("U"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_MIDDLE_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("E"),
                    action = KeyAction.CommitText("E"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("Q"),
                        action = KeyAction.CommitText("Q"),
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("K"),
                        action = KeyAction.CommitText("K"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("I"),
                    action = KeyAction.CommitText("I"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay("J"),
                        action = KeyAction.CommitText("J"),
                    ),
                ),
            ),
        ),
        listOf(
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("C"),
                    action = KeyAction.CommitText("C"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("H"),
                    action = KeyAction.CommitText("H"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("V"),
                        action = KeyAction.CommitText("V"),
                    ),
                ),
            ),
            SPACEBAR_TYPESPLIT_BOTTOM_KEY_ITEM,
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("A"),
                    action = KeyAction.CommitText("A"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.TWO_WAY_VERTICAL,
                swipes = mapOf(
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay("X"),
                        action = KeyAction.CommitText("X"),
                    ),
                ),
            ),
            KeyItemC(
                center = KeyC(
                    display = KeyDisplay.TextDisplay("D"),
                    action = KeyAction.CommitText("D"),
                    size = FontSizeVariant.LARGE,
                    color = ColorVariant.PRIMARY,
                ),
                swipeType = SwipeNWay.FOUR_WAY_CROSS,
                swipes = mapOf(
                    SwipeDirection.RIGHT to KeyC(
                        display = KeyDisplay.TextDisplay("?"),
                        action = KeyAction.CommitText("?"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.LEFT to KeyC(
                        display = KeyDisplay.TextDisplay("!"),
                        action = KeyAction.CommitText("!"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.BOTTOM to KeyC(
                        display = KeyDisplay.TextDisplay(":"),
                        action = KeyAction.CommitText(":"),
                        color = ColorVariant.MUTED,
                    ),
                    SwipeDirection.TOP to KeyC(
                        display = KeyDisplay.TextDisplay(";"),
                        action = KeyAction.CommitText(";"),
                        color = ColorVariant.MUTED,
                    ),
                ),
            ),
        ),
        listOf(
            NUMERIC_KEY_ITEM,
            BACKSPACE_TYPESPLIT_KEY_ITEM,
            RETURN_KEY_ITEM,
        ),
    ),
)

val TYPESPLIT_EN_V3_KEYBOARD_MODES: Map<KeyboardMode, KeyboardC> = mapOf(
    KeyboardMode.MAIN to TYPESPLIT_EN_V3,
    KeyboardMode.SHIFTED to TYPESPLIT_EN_V3_SHIFTED,
    KeyboardMode.NUMERIC to TYPESPLIT_NUMERIC_KEYBOARD,
)
