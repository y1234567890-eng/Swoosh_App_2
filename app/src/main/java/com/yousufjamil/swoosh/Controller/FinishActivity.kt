package com.yousufjamil.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yousufjamil.swoosh.R
import com.yousufjamil.swoosh.Utilities.EXTRA_LEAGUE
import com.yousufjamil.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}