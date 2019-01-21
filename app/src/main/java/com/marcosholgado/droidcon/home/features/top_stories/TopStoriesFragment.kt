package com.marcosholgado.droidcon.home.features.top_stories

import androidx.navigation.fragment.findNavController
import com.marcosholgado.articlelist.ArticleListFragment
import com.marcosholgado.droidcon.home.features.top_stories.TopStoriesFragmentDirections.*

class TopStoriesFragment: ArticleListFragment() {

    override fun onItemSelected(url: String) {
        val navDirections = actionArticlesToReader(url)
        findNavController().navigate(navDirections)
    }
}