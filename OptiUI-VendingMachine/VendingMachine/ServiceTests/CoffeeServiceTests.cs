using Model;
using Service;
using NUnit.Framework;
using Moq;

namespace ServiceTests
{
    [TestFixture]
    public class CoffeeServiceTests
    {
        private Mock<IApplicationSettingsService> _appSettingsMock;
        private Mock<IPaymentService> _paymentServiceMock;
        private Mock<ICondimentServiceFactory> _condimentServiceFactoryMock;

        private ICoffeeService _service;

        [SetUp]
        private void SetUp()
        {
            _appSettingsMock = new Mock<IApplicationSettingsService>();
            _paymentServiceMock = new Mock<IPaymentService>();
            _condimentServiceFactoryMock = new Mock<ICondimentServiceFactory>();

            _service = new CoffeeService(_condimentServiceFactoryMock.Object, _paymentServiceMock.Object, _appSettingsMock.Object);
        }
    }
}
