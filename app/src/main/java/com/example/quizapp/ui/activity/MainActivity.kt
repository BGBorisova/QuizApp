package com.example.quizapp.ui.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.quizapp.R
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
        setToolbar()
        createOnBackPressedCallback()
    }

    private fun setToolbar() =
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.welcomeScreenFragment -> {
                    binding.toolbar.visibility = View.GONE
                }
                R.id.mainScreenFragment -> {
                    binding.toolbar.visibility = View.GONE
                }
                R.id.moduleScreenFragment -> {
                    binding.toolbar.visibility = View.GONE
                }
                else -> {
                    binding.toolbar.visibility = View.VISIBLE
                    binding.toolbar.navigationIcon = null
                }
            }
        }

    private fun createOnBackPressedCallback() =
        onBackPressedDispatcher.addCallback(this) {
            when (navController.currentDestination?.id) {
                R.id.mainScreenFragment -> finish()
                R.id.moduleScreenFragment,
                -> {
                    navController.navigate(R.id.mainScreenFragment)
                }
                else -> navController.navigateUp()
            }
        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) =
        when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}