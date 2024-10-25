package com.example.narutoshippudentips

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.activity6_30daysapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var animeTipAdapter: AnimeTipAdapter
    private val animeTips = mutableListOf<AnimeTip>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Add the tips for each day
        animeTips.add(AnimeTip("Day 1", "Episodes 1-5: Naruto returns to the village.", R.drawable.naruto_day_1))
        animeTips.add(AnimeTip("Day 2", "Episodes 6-10: Team Kakashi faces a new enemy.", R.drawable.naruto_day_2))
        animeTips.add(AnimeTip("Day 3", "Episodes 11-15: The battle with Gaara unfolds.", R.drawable.naruto_day_3))
        animeTips.add(AnimeTip("Day 4", "Episodes 16-20: The secret of the Akatsuki emerges.", R.drawable.naruto_day_4))
        animeTips.add(AnimeTip("Day 5", "Episodes 21-25: Kakashi's ultimate technique is revealed.", R.drawable.naruto_day_5))
        animeTips.add(AnimeTip("Day 6", "Episodes 26-30: Naruto faces off against Orochimaru.", R.drawable.naruto_day_6))
        animeTips.add(AnimeTip("Day 7", "Episodes 31-35: The formation of a new team begins.", R.drawable.naruto_day_7))
        animeTips.add(AnimeTip("Day 8", "Episodes 36-40: Sasuke's past is uncovered.", R.drawable.naruto_day_8))
        animeTips.add(AnimeTip("Day 9", "Episodes 41-45: The search for Sasuke intensifies.", R.drawable.naruto_day_9))
        animeTips.add(AnimeTip("Day 10", "Episodes 46-50: New training for Naruto begins.", R.drawable.naruto_day_10))
        animeTips.add(AnimeTip("Day 11", "Episodes 51-55: Wind-style mastery for Naruto.", R.drawable.naruto_day_11))
        animeTips.add(AnimeTip("Day 12", "Episodes 56-60: Asuma and the Leaf ninja go on the offensive.", R.drawable.naruto_day_12))
        animeTips.add(AnimeTip("Day 13", "Episodes 61-65: A deadly confrontation with Hidan.", R.drawable.naruto_day_13))
        animeTips.add(AnimeTip("Day 14", "Episodes 66-70: Shikamaru takes on Hidan.", R.drawable.naruto_day_14))
        animeTips.add(AnimeTip("Day 15", "Episodes 71-75: Pain, the Akatsuki's true leader, is revealed.", R.drawable.naruto_day_15))
        animeTips.add(AnimeTip("Day 16", "Episodes 76-80: A shocking loss strikes the Leaf village.", R.drawable.naruto_day_16))
        animeTips.add(AnimeTip("Day 17", "Episodes 81-85: The aftermath of the battle with the Akatsuki.", R.drawable.naruto_day_17))
        animeTips.add(AnimeTip("Day 18", "Episodes 86-90: Naruto pushes his training to the limit.", R.drawable.naruto_day_18))
        animeTips.add(AnimeTip("Day 19", "Episodes 91-95: Orochimaru's plans begin to unfold.", R.drawable.naruto_day_19))
        animeTips.add(AnimeTip("Day 20", "Episodes 96-100: Naruto’s mission to find the cure.", R.drawable.naruto_day_20))
        animeTips.add(AnimeTip("Day 21", "Episodes 101-105: The tension with Orochimaru grows.", R.drawable.naruto_day_21))
        animeTips.add(AnimeTip("Day 22", "Episodes 106-110: Jiraiya's investigation begins.", R.drawable.naruto_day_22))
        animeTips.add(AnimeTip("Day 23", "Episodes 111-115: A powerful foe returns to the scene.", R.drawable.naruto_day_23))
        animeTips.add(AnimeTip("Day 24", "Episodes 116-120: Sasuke makes his move.", R.drawable.naruto_day_24))
        animeTips.add(AnimeTip("Day 25", "Episodes 121-125: The team searches for Orochimaru's hideout.", R.drawable.naruto_day_25))
        animeTips.add(AnimeTip("Day 26", "Episodes 126-130: Sasuke faces his mentor.", R.drawable.naruto_day_26))
        animeTips.add(AnimeTip("Day 27", "Episodes 131-135: The truth about the Uchiha clan is revealed.", R.drawable.naruto_day_27))
        animeTips.add(AnimeTip("Day 28", "Episodes 136-140: The battle with Itachi reaches its climax.", R.drawable.naruto_day_28))
        animeTips.add(AnimeTip("Day 29", "Episodes 141-145: The repercussions of the Uchiha fight.", R.drawable.naruto_day_29))
        animeTips.add(AnimeTip("Day 30", "Episodes 146-150: The truth of the past is revealed.", R.drawable.naruto_day_30))

        animeTipAdapter = AnimeTipAdapter(animeTips)
        recyclerView.adapter = animeTipAdapter
    }
}
