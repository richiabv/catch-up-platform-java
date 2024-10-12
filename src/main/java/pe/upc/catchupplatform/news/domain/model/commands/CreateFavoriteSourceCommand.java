/**
 * CreateFavoriteSourceCommand command
 *
 * @Summary
 * The CreateFavoriteSourceCommand is a command object that encapsulates the data needed
 * to create a new favorite news source in the system. It requires the API key for user authentication
 * and the source ID to identify the news source to be added. The command ensures that both the API key
 * and the source ID are not null or empty before proceeding with the creation.
 */

package pe.upc.catchupplatform.news.domain.model.commands;

public record CreateFavoriteSourceCommand(String newsApiKey, String sourceId) {
    public CreateFavoriteSourceCommand {
        if (newsApiKey == null || newsApiKey.isEmpty())
            throw new IllegalArgumentException("NewsApiKey cannot be null or empty");
        if (sourceId == null || sourceId.isEmpty())
            throw new IllegalArgumentException("SourceId cannot be null or empty");
    }
}
